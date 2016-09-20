package com.example.eatbulaga;

import java.util.Random;
import java.util.List;

public class Pertanyaan {
	private String jenis;
    private String tanda;
    private String objek;
    private String jawaban;
    
    public Pertanyaan()
    {
    	jenis="";
    	tanda="";
    	objek="";
    	jawaban=null;
    }
    public Pertanyaan (String _jenis, String _tanda, String _objek)
    {
        jenis=_jenis;
        tanda=_tanda;
        objek=_objek;
        jawaban=null;
    }
    
    public String getJenis()
    {
       return jenis;
    }
    
    public String getTanda()
    {
       return tanda;
    }
    
    public String getObjek()
    {
       return objek;
    }
    
    public String getJawaban()
    {
       return jawaban;
    }
    
    public void setJawaban(String x)
    {
        jawaban=x;
    }
    
    private String prosesText(String text)
    {
        String out="";
        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i)== '_')
            {
                out=out+" ";
            }
            else
            {
                out=out+text.charAt(i);
            }
        }
        return out;
    }
    
    public String toPrint()
    {
        List<Kategori> listkategori = MainActivity.listKategori;
        
        String out="";
        int tipe=0;
        String template="";
        for(Kategori k:listkategori)
        {
            if(k.getNama().equals(jenis))
            {
                tipe=k.getTipe();
                template=k.getTemplate();
            }
        }
        
        if(tipe==1)
        {
            out=template+" "+prosesText(jenis)+"?";
            
        }
        else if(tipe==2)
        {
            out=template+" "+prosesText(jenis)+"nya ";
            if(tanda.equals("="))
            {
                out=out+"adalah ";
            }
            else
            {
               out=out+tanda+" ";
            }
            
            out=out+objek+"?";
        }
        else //if(tipe==3)
        {
            out=template+ " "+prosesText(jenis)+"nya adalah "+objek+"?";
        }
        return out;
    }
    
    public void random(List<Kategori> listKategori, List<Mahasiswa> mhs, int idxAttr)
    {
        Random rand = new Random();
        
        // Membuat pertanyaan
        if(listKategori.get(idxAttr).getTipe()==1)
        {
            String _tanda="=";
            String _objek= "T";
            jenis=listKategori.get(idxAttr).getNama();
            tanda=_tanda;
            objek=_objek;
        }
        else if(listKategori.get(idxAttr).getTipe()==2)
        {
            int randtanda=rand.nextInt(3);
            String _tanda;
            if(randtanda==0)
            {
                _tanda="<";
            }
            else if(randtanda==1)
            {
                _tanda="=";
            }
            else
            {
                _tanda=">";
            }
            String _objek= mhs.get(rand.nextInt(mhs.size())).getAttribute(idxAttr);
            jenis=listKategori.get(idxAttr).getNama();
            tanda=_tanda;
            objek=_objek;
        }
        else //listKategori.get(idxAttr).getTipe()==3
        {
            String _tanda="=";
            String _objek= mhs.get(rand.nextInt(mhs.size())).getAttribute(idxAttr);
            jenis=listKategori.get(idxAttr).getNama();
            tanda=_tanda;
            objek=_objek;
        }
    }
    /**
     * mengembalikan true jika pertanyaan tidak berada dalam list
     * @param list list pertanyaan
     * @return mengembalikan true jika pertanyaan tidak berada dalam list
     */
    public boolean isAsked(List<Pertanyaan> list)
    {
        if(list.isEmpty())
        {
            return false;
        }
        else
        {
            int i=0;
            boolean found=false;
            while(i<list.size() && !found)
            {
                if(toPrint().equalsIgnoreCase(list.get(i).toPrint()))
                {
                    found=true;
                }
                i++;
            }
            return found;
        }
    }

    /**
     * 
     * @param mhs
     * @return mengembalikan true jika pertanyaan merupakan pertanyaan yang pintar
     */
    public boolean goodQuestion(List<Mahasiswa> mhs)
    {
        //System.out.println("--->" +jenis+" "+ objek );
        boolean good=false;
        
        if(tanda.equals("="))
        {
            int i=0;
            while(!good && i<mhs.size())
            {
                if(!mhs.get(i).getAttribute(jenis).equals(objek))
                {
                    good=true;
                }
                i++;
            }
        }
        else
        {
            int qobjek=0;
            for(int j=0;j<objek.length();j++)
            {
                qobjek=(qobjek*10)+objek.charAt(j);
            }
            
            boolean min=false;
            boolean max=false;
            int i=0;
            while((!min || !max ) && i<mhs.size())
            {
                int mobjek=0;
                for(int j=0;j<mhs.get(i).getAttribute(jenis).length();j++)
                {
                    mobjek=(mobjek*10)+mhs.get(i).getAttribute(jenis).charAt(j);
                }

                if(mobjek< qobjek)
                {
                    min=true;
                }
                if(mobjek> qobjek)
                {
                    max=true;
                }
                i++;
            }
            good=min && max;
            
        } 
       return good;
    }
}

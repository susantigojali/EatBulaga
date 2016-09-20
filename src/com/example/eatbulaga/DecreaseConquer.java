package com.example.eatbulaga;

import java.util.ArrayList;
import java.util.List;

public class DecreaseConquer {
	public static List<Mahasiswa> proses(List<Mahasiswa> mhs, int size ,Pertanyaan question, int idxAttr, List<Kategori> listKategori)
    {
        if(size==1)
        {
            List<Mahasiswa> newmhs=new ArrayList<Mahasiswa>();
            if(listKategori.get(idxAttr).getTipe()==1 || listKategori.get(idxAttr).getTipe()==3)
            {
                if(question.getJawaban().equals("y"))
                {
                    if(mhs.get(0).getAttribute(idxAttr).equals(question.getObjek()))
                    {
                        newmhs.add(mhs.get(0));
                    }
                }
                else if(question.getJawaban().equals("b"))
                {
                    newmhs.add(mhs.get(0));
                }
                else //if(question.getJawaban().toLowerCase()=="t")
                {
                    if(!mhs.get(0).getAttribute(idxAttr).equals(question.getObjek()))
                    {
                        newmhs.add(mhs.get(0));
                    }
                }
            }
            else //Eatbulaga.listKategori.get(idxAttr).getTipe()==2
            {
                int mobjek=0;
                for(int i=0;i<mhs.get(0).getAttribute(idxAttr).length();i++)
                {
                    mobjek=(mobjek*10)+mhs.get(0).getAttribute(idxAttr).charAt(i);
                }
                int qobjek=0;
                for(int i=0;i<question.getObjek().length();i++)
                {
                    qobjek=(qobjek*10)+question.getObjek().charAt(i);
                }
                
                if(question.getJawaban().equals("y"))
                {
                    if(question.getTanda().equals("<"))
                    {
                        if(mobjek<qobjek)
                        {
                            newmhs.add(mhs.get(0));
                        }
                    }
                    else if (question.getTanda().equals("="))
                    {
                        if(mobjek==qobjek)
                        {
                            newmhs.add(mhs.get(0));
                        }
                    }
                    else//if (question.getTanda().equals(">"))
                    {
                        if(mobjek>qobjek)
                        {
                            newmhs.add(mhs.get(0));
                        }
                    }
                }
                else if(question.getJawaban().equals("b"))
                {
                    newmhs.add(mhs.get(0));
                }
                else //if(question.getJawaban().toLowerCase()=="t")
                {
                    if(question.getTanda().equals("<"))
                    {
                        if(mobjek>=qobjek)
                        {
                            newmhs.add(mhs.get(0));
                        }
                    }
                    else if (question.getTanda().equals("="))
                    {
                        if(mobjek!=qobjek)
                        {
                            newmhs.add(mhs.get(0));
                        }
                    }
                    else//if (question.getTanda().equals(">"))
                    {
                        if(mobjek<=qobjek)
                        {
                            newmhs.add(mhs.get(0));
                        }
                    }
                }
            }
            return newmhs;
        }
        else //rekursif
        {
            List<Mahasiswa> newmhs=proses(mhs,size-1 ,question,idxAttr,listKategori);
           
            if(listKategori.get(idxAttr).getTipe()==1 || listKategori.get(idxAttr).getTipe()==3)
            {
                if(question.getJawaban().equals("y"))
                {
                    if(mhs.get(size-1).getAttribute(idxAttr).equals(question.getObjek()))
                    {
                        newmhs.add(mhs.get(size-1));
                    }
                }
                else if(question.getJawaban().equals("b"))
                {
                    newmhs.add(mhs.get(size-1));
                }
                else //if(question.getJawaban().toLowerCase()=="t")
                {
                    if(!mhs.get(size-1).getAttribute(idxAttr).equals(question.getObjek()))
                    {
                        newmhs.add(mhs.get(size-1));
                    }
                }
            }
            else //Eatbulaga.listKategori.get(idxAttr).getTipe()==2
            {
                int mobjek=0;
                for(int i=0;i<mhs.get(size-1).getAttribute(idxAttr).length();i++)
                {
                    mobjek=(mobjek*10)+mhs.get(size-1).getAttribute(idxAttr).charAt(i);
                }
                int qobjek=0;
                for(int i=0;i<question.getObjek().length();i++)
                {
                    qobjek=(qobjek*10)+question.getObjek().charAt(i);
                }
                
                if(question.getJawaban().equals("y"))
                {
                    if(question.getTanda().equals("<"))
                    {
                        if(mobjek<qobjek)
                        {
                            newmhs.add(mhs.get(size-1));
                        }
                    }
                    else if (question.getTanda().equals("="))
                    {
                        if(mobjek==qobjek)
                        {
                            newmhs.add(mhs.get(size-1));
                        }
                    }
                    else//if (question.getTanda().equals(">"))
                    {
                        if(mobjek>qobjek)
                        {
                            newmhs.add(mhs.get(size-1));
                        }
                    }
                }
                else if(question.getJawaban().equals("b"))
                {
                    newmhs.add(mhs.get(size-1));
                }
                else //if(question.getJawaban().toLowerCase()=="t")
                {
                    if(question.getTanda().equals("<"))
                    {
                        if(mobjek>=qobjek)
                        {
                            newmhs.add(mhs.get(size-1));
                        }
                    }
                    else if (question.getTanda().equals("="))
                    {
                        if(mobjek!=qobjek)
                        {
                            newmhs.add(mhs.get(size-1));
                        }
                    }
                    else//if (question.getTanda().equals(">"))
                    {
                        if(mobjek<=qobjek)
                        {
                            newmhs.add(mhs.get(size-1));
                        }
                    }
                }
            }
            return newmhs;
        }
    }
}

package com.example.eatbulaga;

public class Mahasiswa {
	private String nama;
    private String jenis_kelamin;
    private String alamat;
    private String tempat_lahir;
    private String tanggal_lahir;
    private String bulan_lahir;
    private String tahun_lahir;
    private String tinggi;
    private String berat;
    private String jilbab;
    private String kacamata;
    private String gendut;
    private String suka_futsal;
    private String suka_bultang;
    private String jurusan;
    private String fakultas;
    
    public Mahasiswa()
    {
        nama="Test";
        jenis_kelamin="L";
        alamat="Dago";
        tempat_lahir="Bandung";
        tanggal_lahir="1";
        bulan_lahir="1";
        tahun_lahir="1994";
        tinggi="170";
        berat="65";
        jilbab="T";
        kacamata="T";
        gendut="T";
        suka_futsal="T";
        suka_bultang="T";
        jurusan="IF";
        fakultas="STEI";
    }

    public Mahasiswa(String _nama, String jk, String _alamat, String tmptlahir, 
                     String tgllahir, String blnlahir, String thnlahir, String _tinggi,
                     String _berat, String _jilbab, String _kacamata, String _gendut,
                     String _suka_futsal, String _suka_bultang, String _jurusan,
                     String _fakultas)
    {
        nama=_nama;
        jenis_kelamin=jk;
        alamat=_alamat;
        tempat_lahir=tmptlahir;
        tanggal_lahir=tgllahir;
        bulan_lahir=blnlahir;
        tahun_lahir=thnlahir;
        tinggi=_tinggi;
        berat=_berat;
        jilbab=_jilbab;
        kacamata=_kacamata;
        gendut=_gendut;
        suka_futsal=_suka_futsal;
        suka_bultang=_suka_bultang;
        jurusan=_jurusan;
        fakultas=_fakultas;  
    }
    
    public void print()
    {
        System.out.println("Nama : "+nama);
        System.out.println("Jenis kelamin : "+jenis_kelamin);
        System.out.println("Alamat : "+alamat);
        System.out.println("Tempat lahir : "+tempat_lahir);
        System.out.println("Tanggal lahir : "+tanggal_lahir);
        System.out.println("Bulan lahir : "+bulan_lahir);
        System.out.println("Tahun lahir : "+tahun_lahir);
        System.out.println("Tinggi : "+tinggi+" cm");
        System.out.println("Berat : "+berat+" kg");
        System.out.println("Jilbab : "+jilbab);
        System.out.println("Kacamata : "+kacamata);
        System.out.println("Gendut : "+gendut);
        System.out.println("Suka futsal : "+suka_futsal);
        System.out.println("Suka bultang : "+suka_bultang);
        System.out.println("Jurusan : "+jurusan);
        System.out.println("Fakultas : "+fakultas);    
    }

    public String getAttribute(int idx)
    {
        if(idx==0)
        {
            return alamat;
        }
        else if(idx==1)
        {
            return berat;
        }
        else if(idx==2)
        {
            return bulan_lahir;
        }
        else if(idx==3)
        {
            return fakultas;
        }
        else if(idx==4)
        {
            return gendut;
        }
        else if(idx==5)
        {
            return jenis_kelamin;
        }
        else if(idx==6)
        {
            return jilbab;
        }
        else if(idx==7)
        {
            return jurusan;
        }
        else if(idx==8)
        {
            return kacamata;
        }
        else if(idx==9)
        {
            return nama;
        }
        else if(idx==10)
        {
            return suka_bultang;
        }
        else if(idx==11)
        {
            return suka_futsal;
        }
        else if(idx==12)
        {
            return tahun_lahir;
        }
        else if(idx==13)
        {
            return tanggal_lahir;
        }
        else if(idx==14)
        {
            return tempat_lahir;
        }
        else // idx==15
        {
            return tinggi;
        }
    }
    
    public String getAttribute(String attr)
    {
        if(attr.equals("alamat"))
        {
            return alamat;
        }
        else if(attr.equals("berat"))
        {
            return berat;
        }
        else if(attr.equals("bulan_lahir"))
        {
            return bulan_lahir;
        }
        else if(attr.equals("fakultas"))
        {
            return fakultas;
        }
        else if(attr.equals("gendut"))
        {
            return gendut;
        }
        else if(attr.equals("jenis_kelamin"))
        {
            return jenis_kelamin;
        }
        else if(attr.equals("jilbab"))
        {
            return jilbab;
        }
        else if(attr.equals("jurusan"))
        {
            return jurusan;
        }
        else if(attr.equals("kacamata"))
        {
            return kacamata;
        }
        else if(attr.equals("nama"))
        {
            return nama;
        }
        else if(attr.equals("suka_bultang"))
        {
            return suka_bultang;
        }
        else if(attr.equals("suka_futsal"))
        {
            return suka_futsal;
        }
        else if(attr.equals("tahun_lahir"))
        {
            return tahun_lahir;
        }
        else if(attr.equals("tanggal_lahir"))
        {
            return tanggal_lahir;
        }
        else if(attr.equals("tempat_lahir"))
        {
            return tempat_lahir;
        }
        else if(attr.equals("tinggi"))
        {
            return tinggi;
        }
        else
        {
            return null;
        }
    }


    public String getNama() 
    {
        return nama;
    }

    public String getJenisKelamin() 
    {
        return jenis_kelamin;
    }

    public String getAlamat() 
    {
         return alamat;
    }

    public String getTempatLahir() 
    {
         return tempat_lahir;
    }

    public String getBulanLahir() 
    {
         return bulan_lahir;
    }

    public String getTahunLahir() 
    {
         return tahun_lahir;
    }
    public String getTinggi() 
    {
         return tinggi;
    }
    public String getBerat() 
    {
         return berat;
    }
    public String getJilbab() 
    {
         return jilbab;
    }
    public String getKacamata() 
    {
         return kacamata;
    }
    public String getGendut() 
    {
         return gendut;
    }

    public String getSukaFutsal() 
    {
         return suka_futsal;
    }
    public String getSukaBultang() 
    {
         return suka_bultang;
    }

    public String getJurusan() 
    {
         return jurusan;
    }
    public String getFakultas() 
    {
         return fakultas;
    }
}

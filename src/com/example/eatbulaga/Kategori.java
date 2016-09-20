package com.example.eatbulaga;

public class Kategori {
	private String nama;
    private int tipe;
    private String template;
    
    public Kategori(String _nama, int _tipe, String _template)
    {
        nama=_nama;
        tipe=_tipe;
        template=_template;
    }
  
   public String getNama()
   {
       return nama;
   }
   
   public int getTipe()
   {
       return tipe;
   }
   
   public String getTemplate()
   {
       return template;
   }
}

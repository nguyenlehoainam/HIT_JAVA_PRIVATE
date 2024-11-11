package bai12;

public class Book {
   
    private int maSach;
    private String tenSach;
    private String tenTacGia;
    private int namSanXuat;
    private double giaTien;

 
    public Book() {}


    public Book(int maSach, String tenSach, String tenTacGia, int namSanXuat, double giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.namSanXuat = namSanXuat;
        this.giaTien = giaTien;
    }

    public int getMaSach() { 
    	return maSach; 
    	}
    public void setMaSach(int maSach) { 
    	this.maSach = maSach; }

    public String getTenSach() {
    	return tenSach;
    	}
    public void setTenSach(String tenSach) { 
    	this.tenSach = tenSach;
    	}

    public String getTenTacGia() {
    	return tenTacGia; 
    	}
    public void setTenTacGia(String tenTacGia) { 
    	this.tenTacGia = tenTacGia;
    	}

    public int getNamSanXuat() { 
    	return namSanXuat; 
    	}
    public void setNamSanXuat(int namSanXuat) { 
    	this.namSanXuat = namSanXuat;
    	}

  

    public double getGiaTien() { 
    	return giaTien; 
    	}
    public void setGiaTien(double giaTien) { 
    	this.giaTien = giaTien; 
    	}

   
    @Override
    public String toString() {
        return 
                "\n maSach=" + maSach +
                "\n tenSach='" + tenSach + 
                "\n tenTacGia='" + tenTacGia + 
                "\n namSanXuat=" + namSanXuat +
                "\n giaTien=" + giaTien ;
    }

   
    public void Display() {
        System.out.println(this.toString());
    }
}

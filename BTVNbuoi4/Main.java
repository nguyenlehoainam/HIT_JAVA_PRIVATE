package bai12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
        books.add(new Book(1, "Sach A", "Tac Gia A", 2000, 100.0));
        books.add(new Book(2, "Sach B", "Tac Gia B", 1995, 150.0));
        books.add(new Book(3, "Sach C", "Tac Gia C", 2010, 120.0));
        books.add(new Book(4, "Sach D", "Tac Gia D", 1980, 90.0));
        books.add(new Book(5, "Sach E", "Tac Gia E", 2005, 130.0));

        while (true) {
        	        System.out.println("=== MENU ===");
        	        System.out.println("1. Thêm sách mới");
        	        System.out.println("2. Chỉnh sửa thông tin sách");
        	        System.out.println("3. In ra danh sách các cuốn sách");
        	        System.out.println("4. In ra cuốn sách lâu đời nhất");
        	        System.out.println("5. In ra cuốn sách phù hợp với giá tiền người mua yêu cầu");
        	        System.out.println("6. Sắp xếp lại danh sách các cuốn sách (theo tên hoặc theo giá tiền)");
        	        System.out.print("Lựa chọn của bạn: ");
        	    
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 0) break;
            switch (choice) {
                case 1 -> addNewBook();
                
                case 2 -> editBookInfo();
                
                case 3 -> books.forEach(Book::Display);
                
                case 4 -> displayOldestBook();
                
                case 5 -> findBooksByPrice();
                
                case 6 -> sortBooks();
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void addNewBook() {
        System.out.print("Nhập mã sách: ");
        int maSach = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tên sách: "); 
        String tenSach = scanner.nextLine();
        System.out.print("Tên tác giả: ");
        String tenTacGia = scanner.nextLine();
        System.out.print("Năm sản xuất: ");
        int namSanXuat = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Giá tiền: "); 
        double giaTien = scanner.nextDouble();
        books.add(new Book(maSach, tenSach, tenTacGia, namSanXuat, giaTien));
        System.out.println("Thêm sách thành công!");
    }
    
    private static void editBookInfo() {
        System.out.print("Nhập mã sách cần sửa: ");
        int maSach = scanner.nextInt();
        scanner.nextLine();
        
        Book bookToEdit = null;
        for (Book book : books) {
            if (book.getMaSach() == maSach) {
                bookToEdit = book;
                break;
            }
        }
        
        
        System.out.print("Tên sách mới : ");
        String tenSach = scanner.nextLine();
            bookToEdit.setTenSach(tenSach);
        
        System.out.print("Tên tác giả mới : ");
        String tenTacGia = scanner.nextLine();
            bookToEdit.setTenTacGia(tenTacGia);

        System.out.print("Năm sản xuất mới : ");
        String namSanXuatStr = scanner.nextLine();
        
            int namSanXuat = Integer.parseInt(namSanXuatStr);
            bookToEdit.setNamSanXuat(namSanXuat);
        

        System.out.print("Giá tiền mới : ");
        String giaTienStr = scanner.nextLine();
            double giaTien = Double.parseDouble(giaTienStr);
            bookToEdit.setGiaTien(giaTien);
        }
    

    private static void displayOldestBook() {
        if (books.isEmpty()) {
            System.out.println("Danh sách sách trống.");
            return;
        }

        Book oldestBook = books.get(0);
        for (Book book : books) {
            if (book.getNamSanXuat() < oldestBook.getNamSanXuat()) {
                oldestBook = book;
            }
        }
        System.out.println("Cuốn sách cổ nhất:");
        oldestBook.Display();
    }

    private static void findBooksByPrice() {
        System.out.print("Nhập giá tiền tối đa: ");
        double maxPrice = scanner.nextDouble();
        System.out.println("Các cuốn sách trong khoảng giá yêu cầu:");
        for (Book book : books) {
            if (book.getGiaTien() <= maxPrice) {
                book.Display();
            }
        }
    }

    private static void sortBooks() {
        System.out.println("1. Theo tên :");
        System.out.println("2.Theo giá tiền :");
        int option = scanner.nextInt();

        if (option == 1) {
            
            for (int i = 0; i < books.size() - 1; i++) {
                for (int j = i + 1; j < books.size(); j++) {
                    if (books.get(i).getTenSach().compareTo(books.get(j).getTenSach()) > 0) {
                        Book temp = books.get(i);
                        books.set(i, books.get(j));
                        books.set(j, temp);
                    }
                }
            }
        } else if (option == 2) {
            
            for (int i = 0; i < books.size() - 1; i++) {
                for (int j = i + 1; j < books.size(); j++) {
                    if (books.get(i).getGiaTien() > books.get(j).getGiaTien()) {
                        Book temp = books.get(i);
                        books.set(i, books.get(j));
                        books.set(j, temp);
                    }
                }
            }
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
            return;
        }

        System.out.println("Danh sách sách sau khi sắp xếp:");
        for (Book book : books) {
            book.Display();
        }
    }
}


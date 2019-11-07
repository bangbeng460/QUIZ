/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author 'KoalaX'
 */
public class Utama {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Customer ct = new Customer();
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.printf("Customer Name : ");
        ct.setName(sc.nextLine());
        System.out.printf("Cutomer Email : ");
        ct.setEmail(sc.nextLine());
        
        ct.displayService();
        int pilih = sc.nextInt();
        float harga = ct.getPrice(pilih);
        System.out.printf("Are you member (Yes/No) : ");
        
        String setatus = sc.next();
        boolean status = ct.checkMemberStatus(setatus);
        
        ct.setPriceService(harga);
        float diskon = ct.getSale(status, harga);
        
        System.out.println("");
        System.out.println("\n****************************");
        System.out.println("******CUSTOMER INVOICE******");
        System.out.println("Date Transaction : "+ct.currentTime());
        System.out.println("Service Price : Rp."+ct.getPriceService());
        System.out.println("Discount : Rp."+ct.getSale(status, harga));
        System.out.println("Total Py : Rp."+ct.getTotalPay(harga, diskon));
        
        System.out.println("\nDevelop By Fiqri Akbar Pratama");
    }
    
}

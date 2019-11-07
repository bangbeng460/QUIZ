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
public class ServicePrice implements ServiceItem{
    
    private float priceService;
    private float discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }

        
    @Override
    public void displayService() {
        Scanner sc = new Scanner(System.in);
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.printf("Choose (1/2/3): ");
    }

    @Override
    public float getPrice(int ServiceItem) {
        switch (ServiceItem){
            case 1 : ServiceItem = 45000; break;
            case 2 : ServiceItem = 55000; break;
            case 3 : ServiceItem = 15000; break;
            default: ServiceItem = 0;
        }
         return ServiceItem;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        return "yes".equals(statusMember);
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        if (isMember ){
            return parServicePrice *0.1f;
        }
        else{
            return 0;
     }
    }
    
    public float getTotalPay(float priceService, float discount){
        return priceService - discount;        
    }
    
}

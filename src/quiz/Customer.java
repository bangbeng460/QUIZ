/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 'KoalaX'
 */
public class Customer extends ServicePrice implements CustomerInvoice{
    
    private String name;
    private String email;
    private boolean member;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean isMember(){
        return false;        
    }
    
    public void serMember(boolean member){
        
    }

    @Override
    public String currentTime() {
       Calendar calendar = Calendar.getInstance();
        SimpleDateFormat tanggal = new SimpleDateFormat("EEEE,d MMMM yyyy "
                + "hh:mm:ss");

        String kalendar = tanggal.format(calendar.getTime());
        
        return kalendar;
    }
       
}

package za.ac.cput.Factory.Police;

import za.ac.cput.Domain.Police.Administrator;

public class AdministratorFactory {

    public static Administrator getAdministrator(String adminID,String adminName,String adminSurname){
        return new Administrator.Builder().adminID(adminID).adminName(adminName).adminSurname(adminSurname).build();
    }
}

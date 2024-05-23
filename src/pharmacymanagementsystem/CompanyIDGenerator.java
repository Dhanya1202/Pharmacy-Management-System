/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacymanagementsystem;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author DELL
 */
class CompanyIDGenerator {
             private static final AtomicInteger uniqueCompanyIDCounter = new AtomicInteger(16);

    public static int generateUniqueMedicineID() {
        return uniqueCompanyIDCounter.getAndIncrement();
    }
}

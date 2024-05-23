/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.concurrent.atomic.AtomicInteger;
public class MedicineIDGenerator {
    
        private static final AtomicInteger uniqueMedicineIDCounter = new AtomicInteger(1);

    public static int generateUniqueMedicineID() {
        return uniqueMedicineIDCounter.getAndIncrement();
    }
}

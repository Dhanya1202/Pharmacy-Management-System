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
public class MedicineIDGenerator {
          private static final AtomicInteger uniqueMedicineIDCounter = new AtomicInteger(30
          );

    public static int generateUniqueMedicineID() {
        return uniqueMedicineIDCounter.getAndIncrement();
    }
}

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
class CustomerIDGenerator {
               private static final AtomicInteger uniqueIDCounter = new AtomicInteger(30);

    public static int generateUniqueMedicineID() {
        return uniqueIDCounter.getAndIncrement();
    }
}

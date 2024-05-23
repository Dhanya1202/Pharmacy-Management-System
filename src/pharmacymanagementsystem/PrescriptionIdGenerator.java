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
public class PrescriptionIdGenerator {
     private static final AtomicInteger uniquePRESIDCounter = new AtomicInteger(50);

    public static int generateUniquePRESID() {
        return uniquePRESIDCounter.getAndIncrement();
    }
}

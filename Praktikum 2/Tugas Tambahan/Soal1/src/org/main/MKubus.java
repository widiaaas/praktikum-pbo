// Nama : Widiawati SIhaloho
// NIM : 24060122120037

package org.main;
import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus
{
    public static void main(String[] args)
    {
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Luas permukaan kubus dengan panjang sisi 4 satuan: " + kubus.hitungLuasAlas());
        System.out.println("Volume kubus dengan panjang sisi 4 satuan: " + kubus.hitungVolume());
    }
}

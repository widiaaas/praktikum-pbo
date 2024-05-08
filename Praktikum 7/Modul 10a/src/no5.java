public class no5 {
    public static void main (String[]args){
        char a = 'a';
        double output = a;

        System.out.println(output);
    }
}

// Penjelasan
// Output yang dihasilkan adalah 97.0 karena char merupakan tipe data yang lebih kecil daripada double,
// Java secara otomatis melakukan konversi tipe data dari char ke double secara implisit (tanpa harus menggunakan konversi eksplisit ).
// Jadi, nilai dari karakter 'a' diubah menjadi nilai ASCII-nya, yang merupakan representasi numerik dari karakter tersebut.
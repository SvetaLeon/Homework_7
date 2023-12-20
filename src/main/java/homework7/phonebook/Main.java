package homework7.phonebook;

public class Main {
    public static void main(String[] args) {

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

        telephoneDirectory.add(new Recording("Oleg Bondarenko", "0631113855"));
        telephoneDirectory.add(new Recording("Maxim Zaharenko", "0937595444"));
        telephoneDirectory.add(new Recording("Alice Kovalenko", "0665994333"));
        telephoneDirectory.add(new Recording("Oleg Dudko", "0504444111"));
        telephoneDirectory.add(new Recording("Eva Marchenko", "0567777666"));
        telephoneDirectory.add(new Recording("Igor Velichko", "0663335444"));
        telephoneDirectory.add(new Recording("Maxim Karpenko", "0985555999"));
        telephoneDirectory.add(new Recording("Maxim Karpenko", "0986985222"));
        telephoneDirectory.add(new Recording("Natalia Butko", "0664411258"));

        telephoneDirectory.find("Alice Kovalenko");
        telephoneDirectory.find("Oleg Bondarenko");
        telephoneDirectory.find("Igor Velichko");
        telephoneDirectory.find("Petro Moroz");
        telephoneDirectory.find("Eva Marchenko");
        telephoneDirectory.find("Julia Ostapchuk");

        System.out.println();
        telephoneDirectory.findAll("Maxim Karpenko");
        telephoneDirectory.findAll("Oleg Bondarenko");
        telephoneDirectory.findAll("Natalia Butko");
        telephoneDirectory.findAll("Denys Ostapchuk");
    }
}

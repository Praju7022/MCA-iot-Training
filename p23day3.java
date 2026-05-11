public class p23day3 {
    public static void main(String[] args) {
        IT_Company t = new TCS();  // interface reference
        t.softwareDevelopment();
        t.Hiring();
    }
}

interface IT_Company {
    public void softwareDevelopment();
    public void Hiring();
}

class TCS implements IT_Company {
    @Override
    public void softwareDevelopment() {
        System.out.println("Development Aadhar card website");
    }

    @Override
    public void Hiring() {
        System.out.println("They are Hiring only MCA Students");
    }
}
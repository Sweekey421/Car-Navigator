public class navigator implements Runnable{
    int s;
    Car car;
    public navigator (int s, Car car)
    {
        this.s = s * 1000;
        this.car = car;
    }
    @Override
    public void run() {
        System.out.println("������� ��������. �������!");
        int t = 0;
        double sredniy;
        double obshiy = 0;
        double v_car = 0;
        int t_ostalos;
        for (int i = s; i > 0; i -= v_car ) {

            v_car = car.getV() * 0.15;
            t ++;
            obshiy += v_car;
            sredniy = obshiy / t;
            t_ostalos = (int) (i / sredniy);
            System.out.println("�������� ������: " + car.getV() + " ��/�.");

            System.out.println("�������� �����: " + i/1000 + " ��, " + t_ostalos + " �.\n" );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("������� ��������!");
    }
}
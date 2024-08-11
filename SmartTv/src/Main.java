public class Main {
    public static void main(String[] args) {
        boolean statusTv = false;
        int volume = 0;
        int canal = 0;

        System.out.println(LigadaOuDesligada(statusTv)); //true
        System.out.println(CanalTvDefinido(30)); //30
        System.out.println(CanalTv(canal)); //1
        System.out.println(VolumeMais(volume));//1
        System.out.println(VolumeMenos(volume));//0
        volume = 3;
        System.out.println(VolumeMenos(volume));//2
    }

    public static boolean LigadaOuDesligada(boolean status) {
        if(status == false) {
            return true;
        }else {
            return false;
        }
    }

    public static int CanalTvDefinido(int canal) {
        return canal;
    }

    public static int CanalTv(int canal) {
        canal++;
        return canal;
    }

    public static int VolumeMais(int vol) {
        vol++;
        return vol;
    }

    public static int VolumeMenos(int vol) {
        if(vol > 0) {
            // Decrementa o valor do volume em 1 antes de retorná-lo
            return --vol;
        } else {
            return vol;
        }
    }
}

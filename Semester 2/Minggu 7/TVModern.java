package tugas2;

public class TVModern extends TV{
    
    public TVModern(String deskripsi, int jumlahChannel) {
        super(deskripsi, jumlahChannel);
    }
    
    static String TELETEXT = "TELETEXT";
    static String TV = "TV";
    
    public void setModusTampilan(String t) {
        TVModern.TELETEXT = t;
    }
    
    public void getModusTampilan() {
        System.out.println("Modus tampilan : " + TELETEXT);
    }
    
    public void setHalamanTeletext(int h) {
        System.out.println("Berpindah ke halaman teletext " + h);
    }
    
    String cd = "";
    public void setDiscTray(String e) {
        this.cd = e;
    }
    
    public void playCD() {
        if (cd.equals("")) {
            System.out.println("Tidak ada CD di dalam disc tray!");
        } else {
            System.out.println("Memutar film " + cd);
        }
    }
    
    
    public static void main(String[] args) {
        
        TVModern user = new TVModern("TV Toshiba 16 inch", 10);
 
        String[] channel = {
          "RCTI", "INDOSIAR", "TV ONE", "MNC", "TRANS 7",
          "ANTV", "NET", "METRO TV", "BAYUANGGA", "GTV"
        };
        
        
       user.getDeskripsi();
        user.getChannel();
        user.setChannels(channel);
        
        user.setChannelAktif(1);
        user.setVolume(80);
        user.setChannelAktif(2);
        user.setChannelAktif(3);
      
        user.setModusTampilan(TVModern.TELETEXT);
        user.getModusTampilan();
        user.setHalamanTeletext(234);
        user.setModusTampilan(TVModern.TV);
        user.getModusTampilan();

        user.playCD();
        user.setDiscTray("Fifa 2020");
        user.playCD();
        
    }
    
}

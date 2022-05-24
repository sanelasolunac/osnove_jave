package p_18_05_2022;

public class MainSlackMessage {
    public static void main(String[] args) {

        SlackMessage message = new SlackMessage();

        message.tekstPoruke = "Jedva cekam da izadjem iz kuce!";
        message.imeIPrezime = "Sanela Solunac";
        message.datumIVreme = "18.05.2020. Vreme 9:49";

        SlackMessage message1 = new SlackMessage();

        message1.tekstPoruke = "Jos jedva cekam da izadjem iz kuce!";
        message1.imeIPrezime = "Sanela Solunac";
        message1.datumIVreme = "18.05.2020. Vreme 9:55";

        System.out.println(message.imeIPrezime + "-" + message.datumIVreme);
        System.out.println(message.tekstPoruke);

        System.out.println(message1.imeIPrezime + "-" + message1.datumIVreme);
        System.out.println(message1.tekstPoruke);
    }
}

package ExerciciosMarketing;

public class Main {
    public static void main(String[] args) {
        MessageService messageService = new MessageService();


        String marketingMessage ="Grande promoção! 50% de desconto em todos os produtos!";


        messageService.sendMessage(marketingMessage, MessageChannel.SMS);
        messageService.sendMessage(marketingMessage, MessageChannel.EMAIL);
        messageService.sendMessage(marketingMessage, MessageChannel.SOCIAL_MEDIA);
        messageService.sendMessage(marketingMessage, MessageChannel.WHATSAPP);


        System.out.println("Enviando Mensagem para E-mail e Whatsapp:");
        String exclusiveMessage = "Oferta exclusiva para clientes vip!";
        messageService.sendMessage(exclusiveMessage, MessageChannel.WHATSAPP);
        messageService.sendMessage(exclusiveMessage, MessageChannel.EMAIL);
    }
}

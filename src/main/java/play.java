import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
public class play extends ListenerAdapter {


    @Override
    public void onMessageReceived(MessageReceivedEvent e){
        if(e.getMessage().getContentRaw().equals("!play")){
            int Max=3,Min=1;
            int comin = (int)(Math.random() * (double)(Max - Min + 1) + (double)Min);

             if(comin==1){
                 e.getChannel().sendMessage("your pp is soft").queue();

             }
             else if(comin==2){
                 e.getChannel().sendMessage("your pp is hard").queue();
             }
             else{
                 e.getChannel().sendMessage("pp not found.. gay lol!").queue();
             }
        }
    }
}

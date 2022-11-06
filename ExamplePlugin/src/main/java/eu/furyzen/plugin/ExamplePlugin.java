package eu.furyzen.plugin;

import android.content.Context;
import com.aliucord.CollectionUtils;
import com.aliucord.annotations.AliucordPlugin;
import com.aliucord.entities.MessageEmbedBuilder;
import com.aliucord.entities.Plugin;
import com.aliucord.patcher.*;
import com.aliucord.wrappers.embeds.MessageEmbedWrapper;
import com.discord.models.user.CoreUser;
import com.discord.stores.StoreUserTyping;
import com.discord.widgets.chat.list.adapter.WidgetChatListAdapterItemMessage;
import com.discord.widgets.chat.list.entries.ChatListEntry;
import com.discord.widgets.chat.list.entries.MessageEntry;

@AliucordPlugin()
public class ExamplePlugin extends Plugin {

    @Override
    public void start(Context context) {
        logger.info("Example plugin started !");
    }

    @Override
    public void stop(Context context) {
        logger.info("Example plugin stopped !");
    }
}

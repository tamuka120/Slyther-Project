package net.gegy1000.slyther.network.message.client;

import net.gegy1000.slyther.client.SlytherClient;
import net.gegy1000.slyther.network.MessageByteBuffer;
import net.gegy1000.slyther.network.message.SlytherClientMessageBase;
import net.gegy1000.slyther.server.ConnectedClient;
import net.gegy1000.slyther.server.SlytherServer;

public class MessageStartLogin extends SlytherClientMessageBase {
    @Override
    public void write(MessageByteBuffer buffer, SlytherClient client) {
        buffer.writeUInt8('c');
    }

    @Override
    public void read(MessageByteBuffer buffer, SlytherServer server, ConnectedClient client) {
    }
}
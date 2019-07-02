//package com.staff.staffapp.adapter;
//
//import android.graphics.Color;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ListView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//import com.squareup.picasso.Picasso;
//import com.staff.staffapp.R;
//import com.staff.staffapp.model.CircleImageView;
//
//public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {
//
//    private List<Messages> userMessagesList;
//    private FirebaseAuth mAuth;
//    private DatabaseReference usersRef;
//
//    public MessageAdapter (List<Messages>UserMessagesList)
//    {
//        this.MessagesList = userMessagesList;
//    }
//
//    @NonNull
//    @Override
//    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view   = LayoutInflater.from(ViewGroup.getContext())
//                .inflate(R.layout.custom_messages_layout, viewGroup, false);
//
//        mAuth = FirebaseAuth.getInstance();
//
//        return new MessageViewHolder(view);
//    }
//
//
//    @Override
//    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position)
//    {
//        String messageSenderId = mAuth.getCurrentUser().getUid();
//        Messages messages= userMessagesList.get(i);
//
//        String fromUserID = messages.getFrom();
//        String fromMessageType = messages.getType();
//
//        UsersRef = FirebaseDatabase.getInstance().getReference().child(fromUserID);
//
//        usersRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
//            {
//                if(dataSnapshot.hasChild("image"));
//                {
//                    String receiverImage = dataSnapshot.child("image").getValue().toString();
//
//                    Picasso.get().load(receiverImage).placeholder(R.drawable.profile_image).into(messageViewHolder.receiverProfileImage);
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//
//            }
//        });
//        if (fromMessageType.equals("text"))
//        {
//        messageViewHolder.receiverMessageText.setVisibility(View.INVISIBLE);
//        messageViewHolder.receiverProfileImage.setVisibility(View.INVISIBLE);
//
//        if (fromUserID.equals(messageSenderId))
//        {
//
//            messageViewHolder.senderMessageText.setBackgroundResource(R.drawable.sender_messages_layout);
//            messageViewHolder.senderMessageText.setTexColor(Color.BLACK);
//            messageViewHolder.senderMessageText.setText(messages.getMessage);
//        }
//
//        else {
//            messageViewHolder.senderMessageText.setVisibility(View.INVISIBLE);
//            messageViewHolder.receiverProfileImage.setVisibility(View.VISIBLE);
//            messageViewHolder.receiverMessageText.setVisibility(View.VISIBLE);
//
//            messageViewHolder.receiverMessageText.setBackgroundResource(R.drawable.receiver_messages_layout);
//            messageViewHolder.receiverMessageText.setTexColor(Color.BLACK);
//            messageViewHolder.receiverMessageText.setText(messages.getMessage);
//
//        }
//    }
//
//
//    @Override
//    public int getItemCount() {
//        return userMessagesList.size();
//    }
//
//
//    public class MessageViewHolder extends RecyclerView.ViewHolder
//    {
//        public TextView senderMessageText, receiverMessageText;
//        public CircleImageView receiverProfileImage;
//
//        public MessageViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            senderMessageText = (TextView) itemView.findViewById(R.id.sender_message_text);
//            receiverMessageText = (TextView) itemView.findViewById(R.id.receiver_message_text);
//            receiverProfileImage = (CircleImageView) itemView.findViewById(R.id.message_profile_image);
//
//        }
//    }
//
//}

package apps.everythingforward.com.cardstrial;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by santh on 2/15/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    ArrayList<String> allNotes;
    Context context;

    public MyAdapter(ArrayList<String> notes, Context myContext)
    {
        allNotes = notes;
        context = myContext;
    }
    Context getContext() {
        return context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView notenameTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            notenameTextView = (TextView)itemView.findViewById(R.id.noteslayouttv);
        }


    }


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.noteslayout,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;




    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {


        holder.notenameTextView.setText(allNotes.get(position));

    }

    @Override
    public int getItemCount() {
        return allNotes.size();
    }


}

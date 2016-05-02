package epeden.nightwalker;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] myDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        myDataset = new String[2];
        myDataset[0] = "WASSUP";
        myDataset[1] = "AGAIN";



//        mAdapter = new MyAdapter(myDataset);
//        mRecyclerView.setAdapter(mAdapter);

    }

    public void backButtonPushed(View v) {
        Intent main_intent = new Intent(this,MainActivity.class);
        startActivity(main_intent);
    }



//    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
//        private String[] mDataset;
//
//        // Provide a reference to the views for each data item
//        // Complex data items may need more than one view per item, and
//        // you provide access to all the views for a data item in a view holder
//        public class ViewHolder extends RecyclerView.ViewHolder {
//            // each data item is just a string in this case
//            public View mView;
//            public TextView mTextView;
//            public ViewHolder(View v) {
//                super(v);
//                mView = v;
//                mTextView = (TextView) findViewById(R.id.info_text);
//            }
//        }
//
//        // Provide a suitable constructor (depends on the kind of dataset)
//        public MyAdapter(String[] myDataset) {
//            mDataset = myDataset;
//
//        }
//
//        // Create new views (invoked by the layout manager)
//        @Override
//        public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            // create a new view
//            View v = LayoutInflater.from(parent.getContext())
//                    .inflate(R.layout.card_layout, parent, false);
//            // set the view's size, margins, paddings and layout parameters
//            ViewHolder vh = new ViewHolder(v);
//            return vh;
//        }
//
//        // Replace the contents of a view (invoked by the layout manager)
//        @Override
//        public void onBindViewHolder(ViewHolder holder, int position) {
//            // - get element from your dataset at this position
//            // - replace the contents of the view with that element
//            holder.mTextView.setText(mDataset[position]);
//
//        }
//
//        // Return the size of your dataset (invoked by the layout manager)
//        @Override
//        public int getItemCount() {
//            return mDataset.length;
//        }
//    }
}

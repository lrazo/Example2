package suitapps.com.example2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {

    private ListView mListView;

    private List<String> mNewsList;

    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_news, container, false);

        mListView = (ListView) fragmentView.findViewById(R.id.listViewNews);

        mNewsList = new ArrayList<String>();

        mNewsList.add("Test item 1");

        mNewsList.add("Test item 2");

        mNewsList.add("Test item 3");

        mListView.setAdapter(new NewsListAdapter());

        return fragmentView;
    }

    private class NewsListAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return mNewsList.size();
        }

        @Override
        public Object getItem(int position) {
            return mNewsList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View rowView = getActivity().getLayoutInflater().inflate(R.layout.row_news_list,null);

            TextView textViewRow = (TextView) rowView.findViewById(R.id.textViewRow);

            textViewRow.setText(mNewsList.get(position));

            ImageView imageView = (ImageView) rowView.findViewById(R.id.imageViewRow);

            Picasso.with(getActivity()).load("http://i.imgur.com/DvpvklR.png").into(imageView);

            return rowView;
        }
    }

}

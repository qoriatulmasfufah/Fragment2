package id.sch.smktelkom_mlg.learn.fragment2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link View1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class View1Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    public static final String ARG_IMAGE = "image";
    public static final String ARG_TEXT = "text";

    // TODO: Rename and change types of parameters

    private int mImage;
    private String mText;

    private ImageView ivImage;
    private TextView tvText;


    public View1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment View1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static View1Fragment newInstance(int image, String text) {
        View1Fragment fragment = new View1Fragment();
        Bundle args = new Bundle();
        args.putInt(ARG_IMAGE, image);
        args.putString(ARG_TEXT, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mImage = getArguments().getInt(ARG_IMAGE);
            mText = getArguments().getString(ARG_TEXT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_view1, container, false);
        ivImage = (ImageView) view.findViewById(R.id.imageView);
        tvText = (TextView) view.findViewById(R.id.textView);

        ivImage.setImageResource(mImage);
        tvText.setText(mText);

        return view;
    }

}

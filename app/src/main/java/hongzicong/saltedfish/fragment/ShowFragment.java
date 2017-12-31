package hongzicong.saltedfish.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import hongzicong.saltedfish.R;
import hongzicong.saltedfish.adapter.TableViewAdapter;
import hongzicong.saltedfish.model.DateDatas;
import hongzicong.saltedfish.view.TableView;

public class ShowFragment extends Fragment {

    private Unbinder mUnbinder;

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.table_view)
    TableView mTableView;

    public static ShowFragment newInstance() {
        ShowFragment fragment = new ShowFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_show, container, false);
        mUnbinder= ButterKnife.bind(this,v);
        initToolbar();
        initTableView();
        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }

    private void initToolbar(){
        ((AppCompatActivity) getActivity()).setSupportActionBar(mToolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void initTableView(){
        DateDatas dateDatas=new DateDatas();
        TableViewAdapter tableViewAdapter=new TableViewAdapter(dateDatas);
        tableViewAdapter.setCurrentDay(200);
        mTableView.setAdapter(tableViewAdapter);
    }

}

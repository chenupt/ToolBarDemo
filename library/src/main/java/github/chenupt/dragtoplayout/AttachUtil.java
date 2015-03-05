package github.chenupt.dragtoplayout;

import android.support.v7.widget.RecyclerView;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;

/**
 * Created by chenupt@gmail.com on 1/30/15.
 * Description : Attach top helper
 */
public class AttachUtil {

    public static boolean isAdapterViewAttach(AbsListView listView){
        if (listView != null && listView.getChildCount() > 0) {
            if (listView.getChildAt(0).getTop() < 0 || view.getFirstVisiblePosition() != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRecyclerViewAttach(RecyclerView recyclerView){
        if (recyclerView != null && recyclerView.getChildCount() > 0) {
            if (recyclerView.getChildAt(0).getTop() < 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isScrollViewAttach(ScrollView scrollView){
        if (scrollView != null) {
            if (scrollView.getScrollY() > 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWebViewAttach(WebView webView){
        if (webView != null) {
            if (webView.getScrollY() > 0) {
                return false;
            }
        }
        return true;
    }
}

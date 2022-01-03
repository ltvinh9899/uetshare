// Generated by view binder compiler. Do not edit!
package ie.app.uetstudents.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ie.app.uetstudents.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SheetbottomCommentUettalkBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final FrameLayout bottomsheetUettalk;

  @NonNull
  public final ImageButton btnUpdateCommentUettalk;

  @NonNull
  public final ProgressBar commentProgressbar;

  @NonNull
  public final RecyclerView commentRecyclerviewUettalk;

  @NonNull
  public final NestedScrollView commentScrollview;

  @NonNull
  public final ImageButton commentUetCamera;

  @NonNull
  public final EditText edtCommentUettalk;

  @NonNull
  public final LinearLayout linearlayoutUettalk;

  @NonNull
  public final ListView listpersonUet;

  @NonNull
  public final TextView txtCommentChuacobinhluan;

  private SheetbottomCommentUettalkBinding(@NonNull FrameLayout rootView,
      @NonNull FrameLayout bottomsheetUettalk, @NonNull ImageButton btnUpdateCommentUettalk,
      @NonNull ProgressBar commentProgressbar, @NonNull RecyclerView commentRecyclerviewUettalk,
      @NonNull NestedScrollView commentScrollview, @NonNull ImageButton commentUetCamera,
      @NonNull EditText edtCommentUettalk, @NonNull LinearLayout linearlayoutUettalk,
      @NonNull ListView listpersonUet, @NonNull TextView txtCommentChuacobinhluan) {
    this.rootView = rootView;
    this.bottomsheetUettalk = bottomsheetUettalk;
    this.btnUpdateCommentUettalk = btnUpdateCommentUettalk;
    this.commentProgressbar = commentProgressbar;
    this.commentRecyclerviewUettalk = commentRecyclerviewUettalk;
    this.commentScrollview = commentScrollview;
    this.commentUetCamera = commentUetCamera;
    this.edtCommentUettalk = edtCommentUettalk;
    this.linearlayoutUettalk = linearlayoutUettalk;
    this.listpersonUet = listpersonUet;
    this.txtCommentChuacobinhluan = txtCommentChuacobinhluan;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SheetbottomCommentUettalkBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SheetbottomCommentUettalkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.sheetbottom_comment_uettalk, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SheetbottomCommentUettalkBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      FrameLayout bottomsheetUettalk = (FrameLayout) rootView;

      id = R.id.btn_update_comment_uettalk;
      ImageButton btnUpdateCommentUettalk = ViewBindings.findChildViewById(rootView, id);
      if (btnUpdateCommentUettalk == null) {
        break missingId;
      }

      id = R.id.comment_progressbar;
      ProgressBar commentProgressbar = ViewBindings.findChildViewById(rootView, id);
      if (commentProgressbar == null) {
        break missingId;
      }

      id = R.id.comment_recyclerview_uettalk;
      RecyclerView commentRecyclerviewUettalk = ViewBindings.findChildViewById(rootView, id);
      if (commentRecyclerviewUettalk == null) {
        break missingId;
      }

      id = R.id.comment_scrollview;
      NestedScrollView commentScrollview = ViewBindings.findChildViewById(rootView, id);
      if (commentScrollview == null) {
        break missingId;
      }

      id = R.id.comment_uet_camera;
      ImageButton commentUetCamera = ViewBindings.findChildViewById(rootView, id);
      if (commentUetCamera == null) {
        break missingId;
      }

      id = R.id.edt_comment_uettalk;
      EditText edtCommentUettalk = ViewBindings.findChildViewById(rootView, id);
      if (edtCommentUettalk == null) {
        break missingId;
      }

      id = R.id.linearlayout_uettalk;
      LinearLayout linearlayoutUettalk = ViewBindings.findChildViewById(rootView, id);
      if (linearlayoutUettalk == null) {
        break missingId;
      }

      id = R.id.listperson_uet;
      ListView listpersonUet = ViewBindings.findChildViewById(rootView, id);
      if (listpersonUet == null) {
        break missingId;
      }

      id = R.id.txt_comment_chuacobinhluan;
      TextView txtCommentChuacobinhluan = ViewBindings.findChildViewById(rootView, id);
      if (txtCommentChuacobinhluan == null) {
        break missingId;
      }

      return new SheetbottomCommentUettalkBinding((FrameLayout) rootView, bottomsheetUettalk,
          btnUpdateCommentUettalk, commentProgressbar, commentRecyclerviewUettalk,
          commentScrollview, commentUetCamera, edtCommentUettalk, linearlayoutUettalk,
          listpersonUet, txtCommentChuacobinhluan);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

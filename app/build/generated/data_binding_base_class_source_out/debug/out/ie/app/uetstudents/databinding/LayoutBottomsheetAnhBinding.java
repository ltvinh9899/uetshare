// Generated by view binder compiler. Do not edit!
package ie.app.uetstudents.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ie.app.uetstudents.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutBottomsheetAnhBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView anhCamera;

  @NonNull
  public final ImageView anhThumuc;

  @NonNull
  public final LinearLayout bottomsheetAnh;

  private LayoutBottomsheetAnhBinding(@NonNull LinearLayout rootView, @NonNull ImageView anhCamera,
      @NonNull ImageView anhThumuc, @NonNull LinearLayout bottomsheetAnh) {
    this.rootView = rootView;
    this.anhCamera = anhCamera;
    this.anhThumuc = anhThumuc;
    this.bottomsheetAnh = bottomsheetAnh;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutBottomsheetAnhBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutBottomsheetAnhBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_bottomsheet_anh, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutBottomsheetAnhBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.anh_camera;
      ImageView anhCamera = ViewBindings.findChildViewById(rootView, id);
      if (anhCamera == null) {
        break missingId;
      }

      id = R.id.anh_thumuc;
      ImageView anhThumuc = ViewBindings.findChildViewById(rootView, id);
      if (anhThumuc == null) {
        break missingId;
      }

      LinearLayout bottomsheetAnh = (LinearLayout) rootView;

      return new LayoutBottomsheetAnhBinding((LinearLayout) rootView, anhCamera, anhThumuc,
          bottomsheetAnh);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

// Generated by view binder compiler. Do not edit!
package ie.app.uetstudents.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class FragmentImageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imageImage;

  @NonNull
  public final Button taianh;

  private FragmentImageBinding(@NonNull LinearLayout rootView, @NonNull ImageView imageImage,
      @NonNull Button taianh) {
    this.rootView = rootView;
    this.imageImage = imageImage;
    this.taianh = taianh;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentImageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_image, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentImageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image_image;
      ImageView imageImage = ViewBindings.findChildViewById(rootView, id);
      if (imageImage == null) {
        break missingId;
      }

      id = R.id.taianh;
      Button taianh = ViewBindings.findChildViewById(rootView, id);
      if (taianh == null) {
        break missingId;
      }

      return new FragmentImageBinding((LinearLayout) rootView, imageImage, taianh);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

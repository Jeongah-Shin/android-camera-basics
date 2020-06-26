# Basic structure for Android Camera2

  - CameraActivity `inflate`
  ```kotlin
  if (null == savedInstanceState) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, Camera2BasicFragment.newInstance())
                .commit()
  }
  ```
  - Camera2BasicFragment<br/><br/>
    **fragment_camera2_basic.xml**
    - AutoFitFrameLayout
    - AutoFitFrameTextureView
    <br/>
    
    ```xml
    <ai.clova.edgedetector.camera.AutoFitFrameLayout
            android:id="@+id/layoutFrame"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintBottom_toTopOf="@id/bottomLayout"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent">
        <ai.clova.edgedetector.camera.AutoFitTextureView
                android:id="@+id/textureView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"/>
    </ai.clova.edgedetector.camera.AutoFitFrameLayout>
    ```
  - values
    - colors.xml
    
    ```xml  
      <?xml version="1.0" encoding="utf-8"?>
      <resources>
          <color name="colorPrimary">#00D97C</color>
          <color name="colorPrimaryTransparent">#4D00D97C</color>
          <color name="colorPrimaryDark">#1E1E1E</color>
          <color name="colorAccent">#E8DC51</color>
          <color name="colorBaseGray">#AFAFAF</color>
          <color name="colorWhite">#FFFFFF</color>
      </resources>
    ```
    
    - dimens.xml
    
    ```xml
      <?xml version="1.0" encoding="utf-8"?>
      <resources>
          <dimen name="camera_height_bottom_layout">100dp</dimen>
          <dimen name="camera_size_tv_state">16sp</dimen>
          <dimen name="camera_margin_start_state_tv_iv">35dp</dimen>
      </resources>
    ```
    
    - strings.xml
    
    ```xml
      <resources>
          <string name="app_name">Edge Detector</string>
          <string name="request_permission">카메라 액세스 권한이 필요합니다.</string>
          <string name="camera_error">이 기기는 Camera2 API를 지원하지 않습니다.</string>
      </resources>
    ```
    
    - styles.xml
    
    ```xml
      <resources>

          <!-- Base application theme. -->
          <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
              <!-- Customize your theme here. -->
              <item name="colorPrimary">@color/colorPrimary</item>
              <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
              <item name="colorAccent">@color/colorAccent</item>
          </style>

          <style name="MaterialTheme" parent="Theme.AppCompat.Light.NoActionBar">
              <item name="android:windowFullscreen">true</item>
          </style>

      </resources>
    ```
    
    

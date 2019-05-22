# Basic structure for Android Camera2

  - CameraActivity `inflate` <br/><br/>
  ```kotlin
  if (null == savedInstanceState) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, Camera2BasicFragment.newInstance())
                .commit()
  }
  ```
  <br/>

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
    <br/>

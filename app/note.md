# Jetpack Compose

- Ada 3 Layout utama
  - Column -> Susunan vertical
  - Row -> susunan horizontal
  - Box -> bertumpuk seperti frame layout.

- Arrangement
Arrangement digunakan untuk mengatur susunan beberapa component dalam satu layout. 
  - SpaceBetween, element awal dan akhir melekat di sisi ruang. sisanya dibagi rata
  - SpaceAround, sisi ruang akan dibagi menjadi jarak di bagian kiri dan kanan setiap element
  - SpaceEvenly, sisa ruang akan dibagi rata ke semua elemen
  - End (LTR), semua element disusun ke sisi akhir
  - Center, semua element disusun di sisi tengah
  - Start(LTR), semua element disusun disisi awal . 

- Alignment
Alignment digunakan untuk mengatur posisi suatu komponen dalam suatu layout. 
  - In Column (Horizontal Alignment)
    - Start
    - CenterHorizontally
    - End
  - In Row (Vertical Alignment)
    - Top
    - CenterVertically
    - Bottom
  - Box
    - TopStart
    - TopCenter
    - TopEnd
    - CenterStart
    - Center
    - CenterEnd
    - BottomStart
    - BottomCenter
    - BottomEnd
- Weight, proporsi tiap element pada layout
- Fill, menentukan whether is fill the screen or not.

## Modifier
modifier adalah sebuah param yang digunakan untuk memodifikasi composable function. 
- macam2 modifier:
- Size
  - fillMaxSize, membuat ukuran component memenuhi layout induknya
  - wrapContentSize, menentukan ukuran berdasarkan ukuran kontent didalamnya
  - size, menentukan ukuran dengan angka yang pasti
  - requiredSize
  - sizeIn, menentukan size dengan rentang tertentu. 
- Action
  - clickable
  - dragable
  - selectable
  - scrollable
  - swipeable
- Padding and Offset
  - all
  - start, top, bottom, end
  - horizontal and vertical
- Drawing
to add some additional accessorise  
  - border, menambah bingkai
  - clip, mengubah bentuk component
  - alpha, merubah transparansi
  - background, menambahkan background
  - shadow, menambahkan bayangan. 
p.s for modifier, urutan dalam berpengaruh significant. jadi perlu diperhatikan (dari luar ke dalam)

## List
- LazyColumn
- LazyRow
- Best Practice
  - Fast, make sure compose function tidak menyebabkan lag gunakan background thread for long operation like
read data in the database and API. passing that data from parameters
  - Idempotent.
  - Side-effect tree, gunakan Effect API to control side-effect.
- 
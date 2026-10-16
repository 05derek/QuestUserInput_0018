package com.example.myapplication

@composable
fun FormDataDiri(modifer: Modifier){
    var textNama by remember {mutableStateOf(value="")}
    var textAlamat by remember {mutableStateOf(value="")}
    var textJK by remember {mutableStateOf(value="")}


    var nama by remember {mutableStateOf(value="")}
    var alamat by remember {mutableStateOf(value="")}
    var jenis by remember {mutableStateOf(values="")}
    var gender:list<string> = ListOf("laki-Laki", "Perempuan")
    Column(modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment>CenterHorizontally){
        OutlinedTextField(

        )
    }

}
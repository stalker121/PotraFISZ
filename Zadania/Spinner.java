
    saveButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String napis = category.getSelectedItem().toString();
            if (napis.equals(/*Miejsce do modyfikacji*/)) {
                saveNewWord(word.getText().toString(), meaning.getText().toString(), "Bez kategorii (Wszystko)", language);
            }
                else if (napis.equals(/*Miejsce do modyfikacji*/)) {
                saveNewWord(word.getText().toString(), meaning.getText().toString(), newCategory.getText().toString(), language);
                saveNewCategory(newCategory.getText().toString());
            } else {
                saveNewWord(word.getText().toString(), meaning.getText().toString(), /*Miejsce do modyfikacji*/, language);
            }
            finish();

        }
    });

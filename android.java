// Simple Alert
new AlertDialog.Builder(context)
    .setTitle("Title")
    .setMessage("Message")
    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            
            dialogInterface.dismiss();
        }
    })
    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    })
    .show();
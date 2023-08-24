namespace Proyecto0031
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void etiqueta1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            String leerArchivo = File.ReadAllText("agenda.txt");
            etiqueta1.Text = leerArchivo;
        }
    }
}
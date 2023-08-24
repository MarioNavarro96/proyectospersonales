namespace Proyecto0029
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            String nombre = txtN.Text;
            String telefono = txtTLF.Text;

            String unido = nombre + " " + telefono;
            
            etiqueta1.Text = unido;
                }
    }
}
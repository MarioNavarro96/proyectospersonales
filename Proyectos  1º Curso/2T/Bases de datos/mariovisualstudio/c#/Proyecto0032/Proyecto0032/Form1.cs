namespace Proyecto0032
{
    public partial class Form1 : Form
    {

        int contador = 0;
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            rejillaDatos1[0, contador].Value = "Mario";
            rejillaDatos1[1, contador].Value = "emaildemario";
            rejillaDatos1[2, contador].Value = "23523452";
            rejillaDatos1.Rows.Add();
            contador++;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            String cadena = File.ReadAllText("agenda.txt");
            String[] partido = cadena.Split(',');
            rejillaDatos1[0, 0].Value = partido[0];
            rejillaDatos1[1, 0].Value = partido[1];
            rejillaDatos1[2, 0].Value = partido[2];
        }
    }
}
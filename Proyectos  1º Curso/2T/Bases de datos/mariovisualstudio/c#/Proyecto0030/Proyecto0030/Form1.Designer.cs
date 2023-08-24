namespace Proyecto0030
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.cajaTexto1 = new System.Windows.Forms.TextBox();
            this.cajaTexto2 = new System.Windows.Forms.TextBox();
            this.cajaTexto3 = new System.Windows.Forms.TextBox();
            this.button1 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // cajaTexto1
            // 
            this.cajaTexto1.Location = new System.Drawing.Point(63, 72);
            this.cajaTexto1.Name = "cajaTexto1";
            this.cajaTexto1.Size = new System.Drawing.Size(247, 23);
            this.cajaTexto1.TabIndex = 0;
            // 
            // cajaTexto2
            // 
            this.cajaTexto2.Location = new System.Drawing.Point(63, 171);
            this.cajaTexto2.Name = "cajaTexto2";
            this.cajaTexto2.Size = new System.Drawing.Size(247, 23);
            this.cajaTexto2.TabIndex = 1;
            // 
            // cajaTexto3
            // 
            this.cajaTexto3.Location = new System.Drawing.Point(63, 266);
            this.cajaTexto3.Name = "cajaTexto3";
            this.cajaTexto3.Size = new System.Drawing.Size(247, 23);
            this.cajaTexto3.TabIndex = 2;
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(63, 368);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(247, 23);
            this.button1.TabIndex = 3;
            this.button1.Text = "Guarda Datos";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(358, 450);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.cajaTexto3);
            this.Controls.Add(this.cajaTexto2);
            this.Controls.Add(this.cajaTexto1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private TextBox cajaTexto1;
        private TextBox cajaTexto2;
        private TextBox cajaTexto3;
        private Button button1;
    }
}
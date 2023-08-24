namespace Proyecto0029
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
            this.label1 = new System.Windows.Forms.Label();
            this.txtN = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.txtTLF = new System.Windows.Forms.TextBox();
            this.button1 = new System.Windows.Forms.Button();
            this.etiqueta1 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(141, 61);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(117, 15);
            this.label1.TabIndex = 0;
            this.label1.Text = "Introduce tu nombre";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // txtN
            // 
            this.txtN.Location = new System.Drawing.Point(93, 97);
            this.txtN.Name = "txtN";
            this.txtN.Size = new System.Drawing.Size(223, 23);
            this.txtN.TabIndex = 1;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(141, 133);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(119, 15);
            this.label2.TabIndex = 2;
            this.label2.Text = "Introduce tu telefono";
            // 
            // txtTLF
            // 
            this.txtTLF.Location = new System.Drawing.Point(93, 164);
            this.txtTLF.Name = "txtTLF";
            this.txtTLF.Size = new System.Drawing.Size(223, 23);
            this.txtTLF.TabIndex = 3;
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(93, 245);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(223, 23);
            this.button1.TabIndex = 4;
            this.button1.Text = "Dime tus datos";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // etiqueta1
            // 
            this.etiqueta1.AutoSize = true;
            this.etiqueta1.Location = new System.Drawing.Point(48, 339);
            this.etiqueta1.Name = "etiqueta1";
            this.etiqueta1.Size = new System.Drawing.Size(38, 15);
            this.etiqueta1.TabIndex = 5;
            this.etiqueta1.Text = "label3";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(378, 427);
            this.Controls.Add(this.etiqueta1);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.txtTLF);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.txtN);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private Label label1;
        private TextBox txtN;
        private Label label2;
        private TextBox txtTLF;
        private Button button1;
        private Label etiqueta1;
    }
}
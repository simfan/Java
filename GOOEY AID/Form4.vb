'                                __
'        ,    This program     ," e`--o
'       ((     was written    (  | __,'
'        \\~——————————————————'\_;/
'        (   by JOSH STODOLA    /
'        /) .———————————————.  )
'       (( (               (( (
'        ``-'               ``-'
'
'            Date: 08/20/05


#Region "  Please do not alter this code.  "

Imports System.IO      'used to get size of file created

Public Class Form4
    Inherits System.Windows.Forms.Form

    Dim strDir As String

#Region " Windows Form Designer generated code "

    Public Sub New()
        MyBase.New()

        'This call is required by the Windows Form Designer.
        InitializeComponent()

        'Add any initialization after the InitializeComponent() call

    End Sub

    'Form overrides dispose to clean up the component list.
    Protected Overloads Overrides Sub Dispose(ByVal disposing As Boolean)
        If disposing Then
            If Not (components Is Nothing) Then
                components.Dispose()
            End If
        End If
        MyBase.Dispose(disposing)
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    Friend WithEvents btnClose As System.Windows.Forms.Button
    Friend WithEvents Panel1 As System.Windows.Forms.Panel
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents lblFileName As System.Windows.Forms.Label
    Friend WithEvents lblFilePath As System.Windows.Forms.Label
    Friend WithEvents lblFileSize As System.Windows.Forms.Label
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents Label6 As System.Windows.Forms.Label
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.btnClose = New System.Windows.Forms.Button
        Me.Panel1 = New System.Windows.Forms.Panel
        Me.Label1 = New System.Windows.Forms.Label
        Me.Label2 = New System.Windows.Forms.Label
        Me.Label3 = New System.Windows.Forms.Label
        Me.Label4 = New System.Windows.Forms.Label
        Me.lblFileName = New System.Windows.Forms.Label
        Me.lblFilePath = New System.Windows.Forms.Label
        Me.lblFileSize = New System.Windows.Forms.Label
        Me.Label5 = New System.Windows.Forms.Label
        Me.Label6 = New System.Windows.Forms.Label
        Me.SuspendLayout()
        '
        'btnClose
        '
        Me.btnClose.Location = New System.Drawing.Point(98, 216)
        Me.btnClose.Name = "btnClose"
        Me.btnClose.Size = New System.Drawing.Size(96, 32)
        Me.btnClose.TabIndex = 0
        Me.btnClose.Text = "&Close"
        '
        'Panel1
        '
        Me.Panel1.BackColor = System.Drawing.Color.Yellow
        Me.Panel1.Location = New System.Drawing.Point(38, 254)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(216, 13)
        Me.Panel1.TabIndex = 89
        '
        'Label1
        '
        Me.Label1.Font = New System.Drawing.Font("Comic Sans MS", 20.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.ForeColor = System.Drawing.SystemColors.Highlight
        Me.Label1.Location = New System.Drawing.Point(0, 8)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(296, 32)
        Me.Label1.TabIndex = 90
        Me.Label1.Text = "File Created!"
        Me.Label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Label2
        '
        Me.Label2.Location = New System.Drawing.Point(24, 64)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(80, 16)
        Me.Label2.TabIndex = 91
        Me.Label2.Text = "File Name:"
        '
        'Label3
        '
        Me.Label3.Location = New System.Drawing.Point(24, 96)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(80, 16)
        Me.Label3.TabIndex = 92
        Me.Label3.Text = "File Path:"
        '
        'Label4
        '
        Me.Label4.Location = New System.Drawing.Point(24, 176)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(80, 16)
        Me.Label4.TabIndex = 93
        Me.Label4.Text = "File Size:"
        '
        'lblFileName
        '
        Me.lblFileName.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblFileName.Font = New System.Drawing.Font("Arial", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblFileName.Location = New System.Drawing.Point(104, 64)
        Me.lblFileName.Name = "lblFileName"
        Me.lblFileName.Size = New System.Drawing.Size(168, 16)
        Me.lblFileName.TabIndex = 94
        '
        'lblFilePath
        '
        Me.lblFilePath.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblFilePath.Font = New System.Drawing.Font("Arial", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblFilePath.Location = New System.Drawing.Point(104, 96)
        Me.lblFilePath.Name = "lblFilePath"
        Me.lblFilePath.Size = New System.Drawing.Size(168, 64)
        Me.lblFilePath.TabIndex = 95
        '
        'lblFileSize
        '
        Me.lblFileSize.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblFileSize.Font = New System.Drawing.Font("Arial", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblFileSize.Location = New System.Drawing.Point(104, 176)
        Me.lblFileSize.Name = "lblFileSize"
        Me.lblFileSize.Size = New System.Drawing.Size(88, 16)
        Me.lblFileSize.TabIndex = 96
        '
        'Label5
        '
        Me.Label5.Font = New System.Drawing.Font("Microsoft Sans Serif", 6.75!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.Location = New System.Drawing.Point(74, 200)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(144, 16)
        Me.Label5.TabIndex = 97
        Me.Label5.Text = "Click close to exit the program"
        Me.Label5.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Label6
        '
        Me.Label6.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.Label6.Location = New System.Drawing.Point(0, 45)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(298, 2)
        Me.Label6.TabIndex = 98
        Me.Label6.Text = "Label6"
        '
        'Form4
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.BackColor = System.Drawing.SystemColors.Control
        Me.ClientSize = New System.Drawing.Size(292, 266)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.lblFileSize)
        Me.Controls.Add(Me.lblFilePath)
        Me.Controls.Add(Me.lblFileName)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.Panel1)
        Me.Controls.Add(Me.btnClose)
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle
        Me.MaximizeBox = False
        Me.MinimizeBox = False
        Me.Name = "Form4"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.Manual
        Me.Text = "File Created Successfully!"
        Me.TransparencyKey = System.Drawing.Color.Yellow
        Me.ResumeLayout(False)

    End Sub

#End Region

    Public Sub SetDirectory(ByVal dir As String)
        strDir = CStr(dir)
    End Sub

    Private Sub btnClose_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnClose.Click
        Me.Close()
    End Sub

    Private Sub Form4_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        Beep()     'yes, this is a built in VB.NET method that makes a beeping noise   :^)

        Dim Info As New FileInfo(strDir)
        lblFileName.Text = Info.Name
        lblFilePath.Text = Info.DirectoryName.Replace(Info.Name, "")
        lblFileSize.Text = CStr(Info.Length & " bytes")
    End Sub
End Class

#End Region

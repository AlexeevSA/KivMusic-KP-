﻿#pragma checksum "..\..\..\..\Views\Seller\ShopWindow.xaml" "{8829d00f-11b8-4213-878b-770e8597ac16}" "ABB7F556BC09521B12937EB70DB9D147E7B6A5C8D4E2100B501F3855972941D1"
//------------------------------------------------------------------------------
// <auto-generated>
//     Этот код создан программой.
//     Исполняемая версия:4.0.30319.42000
//
//     Изменения в этом файле могут привести к неправильной работе и будут потеряны в случае
//     повторной генерации кода.
// </auto-generated>
//------------------------------------------------------------------------------

using KivMusic.Views.Seller;
using System;
using System.Diagnostics;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Media.Imaging;
using System.Windows.Media.Media3D;
using System.Windows.Media.TextFormatting;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Windows.Shell;


namespace KivMusic.Views.Seller {
    
    
    /// <summary>
    /// ShopWindow
    /// </summary>
    public partial class ShopWindow : System.Windows.Controls.Page, System.Windows.Markup.IComponentConnector {
        
        
        #line 24 "..\..\..\..\Views\Seller\ShopWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.DataGrid dtShops;
        
        #line default
        #line hidden
        
        
        #line 60 "..\..\..\..\Views\Seller\ShopWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox txtShopName;
        
        #line default
        #line hidden
        
        
        #line 62 "..\..\..\..\Views\Seller\ShopWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox txtShopAddress;
        
        #line default
        #line hidden
        
        
        #line 63 "..\..\..\..\Views\Seller\ShopWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button btnAdd;
        
        #line default
        #line hidden
        
        
        #line 64 "..\..\..\..\Views\Seller\ShopWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button btnUpd;
        
        #line default
        #line hidden
        
        
        #line 65 "..\..\..\..\Views\Seller\ShopWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button btnDel;
        
        #line default
        #line hidden
        
        
        #line 69 "..\..\..\..\Views\Seller\ShopWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button btnBack;
        
        #line default
        #line hidden
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Uri resourceLocater = new System.Uri("/KivMusic;component/views/seller/shopwindow.xaml", System.UriKind.Relative);
            
            #line 1 "..\..\..\..\Views\Seller\ShopWindow.xaml"
            System.Windows.Application.LoadComponent(this, resourceLocater);
            
            #line default
            #line hidden
        }
        
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Never)]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Design", "CA1033:InterfaceMethodsShouldBeCallableByChildTypes")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Maintainability", "CA1502:AvoidExcessiveComplexity")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1800:DoNotCastUnnecessarily")]
        void System.Windows.Markup.IComponentConnector.Connect(int connectionId, object target) {
            switch (connectionId)
            {
            case 1:
            this.dtShops = ((System.Windows.Controls.DataGrid)(target));
            
            #line 34 "..\..\..\..\Views\Seller\ShopWindow.xaml"
            this.dtShops.SelectionChanged += new System.Windows.Controls.SelectionChangedEventHandler(this.dtShops_SelectionChanged);
            
            #line default
            #line hidden
            return;
            case 2:
            this.txtShopName = ((System.Windows.Controls.TextBox)(target));
            return;
            case 3:
            this.txtShopAddress = ((System.Windows.Controls.TextBox)(target));
            return;
            case 4:
            this.btnAdd = ((System.Windows.Controls.Button)(target));
            
            #line 63 "..\..\..\..\Views\Seller\ShopWindow.xaml"
            this.btnAdd.Click += new System.Windows.RoutedEventHandler(this.btnAdd_Click);
            
            #line default
            #line hidden
            return;
            case 5:
            this.btnUpd = ((System.Windows.Controls.Button)(target));
            
            #line 64 "..\..\..\..\Views\Seller\ShopWindow.xaml"
            this.btnUpd.Click += new System.Windows.RoutedEventHandler(this.btnUpd_Click);
            
            #line default
            #line hidden
            return;
            case 6:
            this.btnDel = ((System.Windows.Controls.Button)(target));
            
            #line 65 "..\..\..\..\Views\Seller\ShopWindow.xaml"
            this.btnDel.Click += new System.Windows.RoutedEventHandler(this.btnDel_Click);
            
            #line default
            #line hidden
            return;
            case 7:
            this.btnBack = ((System.Windows.Controls.Button)(target));
            
            #line 69 "..\..\..\..\Views\Seller\ShopWindow.xaml"
            this.btnBack.Click += new System.Windows.RoutedEventHandler(this.btnBack_Click);
            
            #line default
            #line hidden
            return;
            }
            this._contentLoaded = true;
        }
    }
}

   M S B A M L   `   `   `  ????C  ?KivMusic, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null=#clr-namespace:KivMusic.Views.SellerKivMusic.Views.Seller  5      U QLiveCharts.Wpf, Version=0.9.7.0, Culture=neutral, PublicKeyToken=0bc1f845d1ebb8dfG4clr-namespace:LiveCharts.Wpf;assembly=LiveCharts.WpfLiveCharts.Wpf 5      '    !KivMusic.Views.Seller.ChartWindow   5      R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5      R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5      Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5      @d2http://schemas.microsoft.com/expression/blend/2008     5      5local#clr-namespace:KivMusic.Views.Seller     5      Dlvc4clr-namespace:LiveCharts.Wpf;assembly=LiveCharts.Wpf     5        N? Title$  ChartWindow??5
      .??5      ? 
??????? ? ColumnDefinitions 5   
   ?? 5      ?? 5      ?? 5       ? RowDefinitions 5   
   ?? 5      $
??Auto ?6   ?? 5      $??* ?6   ?? 5      $??* ?6   .+?5   
   #  LiveCharts.Wpf.CartesianChart  &   LiveCharts.Wpf.Charts.Base.Chart   LegendLocation$
 Left=?5      $??5,5,5,50q?5      $??3??5      $??3??5         Series 5      ?? *SeriesCollection+   AxisX 5        LiveCharts.Wpf.Axis     Title$ Покупатель??6      Labels 5       ?? *Labels+67      AxisY 5#        $ Сумма чека??6   	   LabelFormatter	 5$      ?? *	Formatter+6B   5&      ?? 5(   
   
 ?? Orientation$
 Vertical=?6   $??Bottom=?5)      $??2??5*      $??0??5+      .+?5,      ?? -   5        $??btnBack??5,      $??
Назад??6$   $??5q?64   6?   5-      50      51      
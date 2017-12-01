# Spring Fest 2017のうらがみ発表資料とサンプル

[発表資料](https://backpaper0.github.io/spring-fest-2017/#1)

## サンプル

* sample1 ... クライアントと、認可サーバー兼リソースサーバー
* sample2 ... クライアントと、認可サーバー
* sample3 ... クライアントと、認可サーバーと、リソースサーバー
* sample4 ... Spring Security 5のクライアント
* [sample5](./sample5/README.md) ... 認可サーバー兼リソースサーバーをいろいろカスタマイズしたやつ

## ぜんぶgradlew eclipseする

```console
for i in `ls -d sample*/*`;do $i/gradlew -p $i eclipse;done
```


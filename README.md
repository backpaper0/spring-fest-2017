# Spring Fest 2017のうらがみ発表資料とサンプル

[発表資料](https://backpaper0.github.io/spring-fest-2017/#1)

## サンプル

* sample1 ... クライアントと、認可サーバー兼リソースサーバー
* sample2 ... クライアントと、認可サーバー
* sample3 ... クライアントと、認可サーバーと、リソースサーバー
* sample4 ... Spring Security 5のクライアント
* [sample5](./sample5/README.md) ... 認可サーバー兼リソースサーバーをいろいろカスタマイズしたやつ

## ぜんぶビルドする

```console
for i in `git ls-files|grep pom\.xml`; do mvn -f $i clean package; done
```

## ぜんぶのSpring Bootのバージョンを上げる

```console
git grep -l 1\.5\.14\|xargs sed -i '' -e 's/1\.5\.14\/1.5.15/g'
git grep -l 2\.0\.3\|xargs sed -i '' -e 's/2\.0\.3\/2.0.4/g'
```


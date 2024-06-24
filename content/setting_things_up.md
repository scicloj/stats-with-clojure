
## Clojure

You need to have Clojure installed to work with this book. If you don't know Clojure, there ae some resources like <https://clojure.org/guides/learn/syntax>, there are some Clojure books you could read <https://clojure.org/community/books>. You can get help from Clojure Slack or from Clojure Zulip <https://clojurians.zulipchat.com>.

## IDE

You need to have a good IDE for CLojure. Emacs <https://www.gnu.org/software/emacs/> is good, and you have an extension called Cider <https://cider.mx/> that helps you to work with Clojure.

If you are okay about getting tracked VSCode <https://code.visualstudio.com/>, along with Calva <https://calva.io/> can be used. One could also use VSCodium <https://vscodium.com/> in case you do not want the evils of Microsoft on your machine, Calva works perfectly well with VSCodium.

## Git

Make sure you know git, and have it installed on your system. You can learn about it here <https://www.git-scm.com/>.

## Clone the project

You can clone the entire project from github <https://github.com/scicloj/stats-with-clojure>. you may use:

```
$ git clone git@github.com:scicloj/stats-with-clojure.git
```

Or

```
$ git clone https://github.com/scicloj/stats-with-clojure.git
```

## Run the project

Once cloned, navigate to `stats-with-clojure` folder:q

```
$ cd stats-with-clojure
```

Then in the folder jack in with `deps.edn`. 


If all the packages needed couldn't be installed trying:


```
$ clj -P -Sthreads 1
```

in terminal. Then try to jackin with `deps.edn` again.




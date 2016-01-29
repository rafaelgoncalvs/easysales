var gulp = require('gulp');
var browserify = require('browserify');
var uglify = require('gulp-uglify');
var source = require('vinyl-source-stream');
var buffer = require('vinyl-buffer');
var watch = require('gulp-watch');

gulp.task('minifier', function() {
	return gulp.src(['app/**/*.js'])
			.pipe(uglify())
			.pipe(gulp.dest('./'));
});

gulp.task('bundle', function() {
	return browserify({ entries: ['./app/main.js'] })
	    .bundle()        
	    .pipe(source('main.js'))
	    .pipe(buffer())
	    //.pipe(uglify())
	    .pipe(gulp.dest('./'));
});

gulp.task('watch', function() {
	var watcher = gulp.watch('app/**/*.js', ['bundle']);
	watcher.on('change', function(event) {
  		console.log('File ' + event.path + ' was ' + event.type + ', running tasks...');
	});
});


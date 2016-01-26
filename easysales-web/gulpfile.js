var gulp = require('gulp');
var browserify = require('browserify');
var uglify = require('gulp-uglify');
var source = require('vinyl-source-stream');
var buffer = require('vinyl-buffer');

gulp.task('scripts', function() {
	return gulp.src(['app/**/*.js'])
			.pipe(uglify())
			.pipe(gulp.dest('./'));
});

gulp.task('browserify', function() {
	return browserify({ entries: ['./app/main.js'] })
	    .bundle()        
	    .pipe(source('main.js'))
	    .pipe(buffer())
	    //.pipe(uglify())
	    .pipe(gulp.dest('./'));
});

